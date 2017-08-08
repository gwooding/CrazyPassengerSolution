# CrazyPassengerSolution
Welcome to the CrazyPassengerSolution wiki!
The problem:
100 passengers are waiting to board a plane.  They each have preallocated seats.  The first one is crazy and sits in a seat at random.  Everyone else files in, and takes their seat if it is free, or picks one at random if it is not.  What's the probability that the last person ends up with their preallocated seat?

For the coding solution, I adopted a brute force approach, testing a large sample of "planes", using Scala and Specs 2 for testing.  I used functional programming and parallel collections for speed-up.

I wasn't happy with this and came up with my own mathematical proof for why the answer is always a half, regardless of how many passengers their are.

![Alt text](https://github.com/gwooding/CrazyPassengerSolution/blob/master/Proof.png)
