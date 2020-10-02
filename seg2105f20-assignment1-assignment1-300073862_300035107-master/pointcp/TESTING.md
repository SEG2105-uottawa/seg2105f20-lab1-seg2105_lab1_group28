
# Your discussion about testing

This is where you should provide a description in
[GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
that clearly describes:

* how you did the tests,
* sample outputs from running the tests
* the table and
* a discussion of the results.

To do the performance test, we create 100 random instances and for each instance call each method 300000 times to get the elapsed running time of each method. Then store the results in a 2D array. Then using the data stored in this 2D array to calculate the maximum result, minimum result and median result of each method. Also, calculate the whole running time of the test program. Finally, print the result.

sample outputs (with top 10 random instances)
Design 2
Run 1: [6, 5, 3, 3, 7, 18, 21, 109]
Run 2: [0, 0, 0, 0, 3, 11, 11, 97]
Run 3: [0, 0, 0, 0, 0, 0, 0, 95]
Run 4: [0, 0, 0, 0, 0, 0, 0, 100]
Run 5: [0, 0, 0, 0, 0, 0, 0, 97]
Run 6: [0, 0, 0, 0, 0, 0, 0, 93]
Run 7: [0, 0, 0, 0, 0, 0, 0, 91]
Run 8: [0, 0, 0, 0, 0, 0, 0, 91]
Run 9: [0, 0, 0, 0, 0, 0, 0, 98]
Run 10: [0, 0, 0, 0, 0, 0, 0, 94]
Average: [2.2, 2.73, 0.03, 0.03, 0.1, 5.08, 9.99, 93.36]
Maxs: [11, 16, 3, 3, 7, 26, 53, 130]
Mins: [0, 0, 0, 0, 0, 0, 0, 85]
Meds: [0, 0, 0, 0, 0, 0, 0, 92]
Total Runtime: 11360

Design 3
Run 1: [3, 3, 3, 23, 28, 6, 6, 85]
Run 2: [0, 0, 0, 20, 23, 3, 0, 49]
Run 3: [0, 0, 0, 25, 21, 0, 0, 42]
Run 4: [0, 0, 0, 21, 21, 0, 0, 40]
Run 5: [0, 0, 0, 19, 20, 0, 0, 39]
Run 6: [0, 0, 0, 19, 20, 0, 0, 39]
Run 7: [0, 0, 0, 19, 20, 0, 0, 40]
Run 8: [0, 0, 0, 21, 23, 0, 0, 43]
Run 9: [0, 0, 0, 21, 21, 0, 0, 43]
Run 10: [0, 0, 0, 21, 22, 0, 0, 42]
Average: [0.03, 0.03, 0.03, 23.6, 24.02, 0.09, 0.06, 41.75]
Maxs: [3, 3, 3, 33, 58, 6, 6, 127]
Mins: [0, 0, 0, 19, 19, 0, 0, 38]
Meds: [0, 0, 0, 21, 21, 0, 0, 40]
Total Runtime: 8969

Design 4
Run 1: [4, 3, 3, 3, 18, 29, 4, 95]
Run 2: [0, 1, 0, 0, 10, 30, 2, 93]
Run 3: [0, 0, 0, 0, 1, 20, 0, 71]
Run 4: [0, 0, 0, 0, 1, 20, 0, 78]
Run 5: [0, 0, 0, 0, 1, 23, 0, 85]
Run 6: [0, 0, 0, 0, 1, 27, 0, 89]
Run 7: [0, 0, 0, 0, 1, 23, 0, 82]
Run 8: [0, 0, 0, 0, 1, 23, 0, 81]
Run 9: [0, 0, 0, 0, 1, 20, 0, 71]
Run 10: [0, 0, 0, 0, 1, 20, 0, 123]
Average: [0.04, 0.04, 0.03, 0.03, 6.06, 24.28, 0.06, 74.71]
Maxs: [4, 3, 3, 3, 26, 34, 4, 123]
Mins: [0, 0, 0, 0, 0, 19, 0, 62]
Meds: [0, 0, 0, 0, 1, 22, 0, 72]
Total Runtime: 10531

Design 5
Run 1: [8, 6, 3, 3, 6, 17, 24, 109]
Run 2: [0, 0, 0, 0, 4, 7, 11, 107]
Run 3: [0, 0, 0, 0, 0, 0, 0, 100]
Run 4: [0, 0, 0, 0, 0, 0, 0, 92]
Run 5: [0, 0, 0, 0, 0, 0, 0, 91]
Run 6: [0, 0, 0, 0, 0, 0, 0, 90]
Run 7: [0, 0, 0, 0, 0, 0, 0, 90]
Run 8: [0, 0, 0, 0, 0, 0, 0, 91]
Run 9: [0, 0, 0, 0, 0, 0, 0, 91]
Run 10: [0, 0, 0, 0, 0, 0, 0, 174]
Average: [0.12, 0.14, 0.13, 13.28, 13.46, 0.41, 0.53, 70.93]
Maxs: [8, 6, 3, 31, 33, 17, 24, 181]
Mins: [0, 0, 0, 0, 0, 0, 0, 39]
Meds: [0, 0, 0, 11, 12, 0, 0, 80]
Total Runtime: 9908

From the data above, we can find that design 3 and design 5 is more efficient than other designs. And the average running time of each method in design 5 is always between the average running time of each method in design 2 and design 3.
