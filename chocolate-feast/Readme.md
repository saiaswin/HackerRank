<h1 align="center"><a href="https://www.hackerrank.com/challenges/chocolate-feast">Chocolate Feast</a></h1>
<br />
<b>Problem Statement</b>

Little Bob loves chocolates, and goes to a store with $N in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

<b>Input Format:</b> 
The first line contains the number of test cases T(<=1000). 
T lines follow, each of which contains three integers N, C and M

<b>Output Format:</b> 
Print the total number of chocolates Bob eats.

<b>Constraints</b>
2≤N≤10000 <br /> 
1≤C≤N <br />
2≤M≤N <br />

<b>Sample input</b>

3<br />
10 2 5<br />
12 4 4<br />
6 2 2<br />

<b>Sample Output</b>

6<br />
3<br />
5<br />

<b>Explanation</b>

In the first case, he can buy 5 chocolates with $10 and exchange the 5 wrappers to get one more chocolate. Thus, the total number of chocolates is 6.

In the second case, he can buy 3 chocolates for $12. However, it takes 4 wrappers to get one more chocolate. He can't avail the offer and hence the total number of chocolates remains 3.

In the third case, he can buy 3 chocolates for $6. Now he can exchange 2 of the 3 wrappers and get 1 additional piece of chocolate. Now he can use his 1 unused wrapper and the 1 wrapper of the new piece of chocolate to get one more piece of chocolate. So the total is 5.
