# Computer Networks Laboratory

This repository contains the course content for the Computer Networks Laboratory (Course Code: 20CS58L). This practical laboratory course is part of the Professional Core Course and is designed to provide hands-on experience in various aspects of computer networking. It covers both theoretical and programming aspects.

## Course Details

- **Course Title**: Computer Networks Laboratory
- **Course Code**: 20CS58L
- **Credits**: 1.5
- **Contact Hours (L: T: P)**: 0:0:39
- **Type of Course**: Practical
- **Category**: Professional Core Course
- **CIE Marks**: 50
- **SEE Marks**: 50
- **Pre-requisite**: Data Communication, Computer Networks

## Course Objectives

The course aims to enable students to:

1. Gain an understanding of different networking commands commonly used.
2. Gain hands-on experience related to error detection, routing, and congestion control algorithms.
3. Simulate the workings of different networks using simulation software, such as NS2/NS3.

## Program List

### Part-A: Implementation in C++/Java/Python

1. **Program 1**
   - A. Use appropriate tools to find host name, IP address, physical address, subnet mask, default gateway, etc. (Hint: Ipconfig).
   - B. Identify TCP connections, listening ports, Ethernet statistics, IP routing table, IPv4 statistics, etc. (Hint: netstat).

2. **Program 2**
   - Write a program to sort frames using appropriate sorting techniques.

3. **Program 3**
   - Write a program for error-detecting code using CRC-CCITT (16-bits).

4. **Program 4**
   - Write a program to find the shortest path between vertices using the Bellman-Ford algorithm.

5. **Program 5**
   - Using TCP/IP sockets, write a client-server program to make the client send the file name and make the server send back the contents of the requested file if present.

6. **Program 6**
   - Write a program on a datagram socket for client/server to display messages on the client side, typed at the server side.

7. **Program 7**
   - Write a program for the simple RSA algorithm to encrypt and decrypt data.

8. **Program 8**
   - Write a program for congestion control using the leaky bucket algorithm and token bucket algorithm.

9. **Program 9**
   - Write a program to implement random early detection (RED) congestion control algorithm.

### Part-B: Simulation using suitable software

10. **Program 10**
    - a. Implement a three-node point-to-point network with duplex links between them. Set the queue size, vary the bandwidth, and find the number of packets dropped.
    - b. Implement the transmission of ping messages/trace route over a network topology consisting of 6 nodes and find the number of packets dropped due to congestion.

11. **Program 11**
    - a. Implement an Ethernet LAN using n nodes and set multiple traffic nodes. Plot congestion window for different source/destination pairs.
    - b. Implement a simple ESS (Extended Service Set) with transmitting nodes in a wireless LAN. Simulate and determine the performance concerning the transmission of packets.

12. **Program 12**
    - a. Implement and study the performance of GSM on NS2/NS3 (Using MAC layer) or equivalent environment.
    - b. Implement and study the performance of CDMA on NS2/NS3 (Using stack called Call net) or equivalent environment.

- Feel free to explore each program within the respective directories in this repository for details and implementation. 
