package kafkaUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;

/**
 *
 * @author joaoalegria
 */
public class RebalanceListener<K,V> implements ConsumerRebalanceListener{
    
    private KafkaConsumer<K,V> consumer;
    private Map<TopicPartition, OffsetAndMetadata> currentOffsets = new HashMap<TopicPartition,OffsetAndMetadata>();

    public RebalanceListener(KafkaConsumer<K,V> con) {
        this.consumer = con;
    }
    
    public void addOffset(String topic, int partition, long offset) {
        currentOffsets.put(new TopicPartition(topic, partition), new OffsetAndMetadata(offset, "Commit"));
    }
    
    public Map<TopicPartition, OffsetAndMetadata> getCurrentOffsets() {
         Map<TopicPartition, OffsetAndMetadata> tmp = currentOffsets;
         currentOffsets.clear();
         return tmp;
    }

    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
//        System.out.println("Following Partitions Assigned ....");
//        for (TopicPartition partition : partitions)
//            System.out.println(partition.partition() + ",");
    }

    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
//        System.out.println("Following Partitions Revoked ....");
//        for (TopicPartition partition : partitions)
//            System.out.println(partition.partition() + ",");
//
//
//        System.out.println("Following Partitions commited ....");
//        for (TopicPartition tp : currentOffsets.keySet())
//            System.out.println(tp.partition());

        consumer.commitSync(currentOffsets);
        currentOffsets.clear();
    }

}
