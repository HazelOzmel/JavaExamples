# JavaExamples

In the army, each soldier has an assigned rank. A soldier of rank X has to report to(any) soldier of rank X+1. Many soldiers can report the same superior. Write a function: that given an array ranks consisting ranks return the number of soldiers who can report to some Superior.

Examples:

Given ranks = [3,4,3,0,2,2,3,0,0] should return 5, because:
Three soldiers of rank 3(ranks[0],ranks[2],ranks[6] may report to a soldier of rank 4
Two soldiers of rank 2 may report to any soldier of rank 3.
Given Ranks = [4,2,0] should return 0,

Given Ranks = [4,4,3,3,1,0] your function should return 3, because:

A soldier of rank 0 can report to a soldier of rank 1.
Two soldiers of rank 3 can report to any soldier of rank 4.
