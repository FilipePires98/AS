# SCP
Simulation of a Scientific Computation Platform With a Focus on Quality Attributes

![](https://img.shields.io/badge/Academical%20Project-Yes-success)
![](https://img.shields.io/badge/License-Free%20To%20Use-green)
![](https://img.shields.io/badge/Made%20With-Java-red)
![](https://img.shields.io/badge/Made%20With-Kafka-red)
![](https://img.shields.io/badge/Maintained-No-red)

## Description

The aim of the assignment was to design and develop a software architecture relying on four of the most relevant quality attributes: performance, availability, scalability and usability.
During development, we came up with the solution for an infrastructure for our stakeholder.
The platform here presented is capable of deploying a cluster of servers monitored by a tactic entity and whose requests from clients are distributed by a load balancer.
Although the cluster is locally simulated, the configuration is done so that it is possible to deploy in a distributed environment.

<p float="left">
  <img src="https://github.com/FilipePires98/SCP/blob/master/docs/img/C_active.png" width="360px">
  <img src="https://github.com/FilipePires98/SCP/blob/master/docs/img/S_active.png" width="360px">
</p>

GUIs of each independent process during the processing of multiple requests.

![UserInterface3-lbm](https://github.com/FilipePires98/SCP/blob/master/docs/img/LBM_large.png)

Load Balancer and Tactic Manager’s GUI in expanded view during the processing of multiple requests in a cluster of 20 Calculation servers.

## Repository Structure

/docs - contains project report and diagrams

/src - contains the source code of the simulator, written in Java

## Instructions to Build and Run

1. Have installed Java SE8.
2. Have installed NetBeans or other IDE (only tested with NetBeans).
3. Open the project folder 'PA3_P1G07' on your IDE.
4. Run the Main class and enjoy the Simulated Scientific Computation Platform.

## Authors

The authors of this repository are Filipe Pires and João Alegria, and the project was developed for the Software Architecture Course of the Master's degree in Informatics Engineering of the University of Aveiro.

For further information, please read our [report](https://github.com/FilipePires98/SCP/blob/master/docs/report.pdf) or contact us at filipesnetopires@ua.pt or joao.p@ua.pt.
