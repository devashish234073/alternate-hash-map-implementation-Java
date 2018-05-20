# alternate-hash-map-implementation-Java

This is a light weight HashMap implementation developed for understanding the HashMap in java better.

The KVPair.java class servers as the equivalent of HashMap.

There's a variable named hashTable which is an array of LinkedList.(This linked list is also a light weight version without using generics so as to undestand it better)

![p1](https://user-images.githubusercontent.com/20777854/40274878-a7a183a2-5bff-11e8-82df-ee112eb7e650.png)

Here the constructor desides the size of the hashTable. So its not dynamically increasing.

The hashing algorithm is also simple. As shown below:

![p2](https://user-images.githubusercontent.com/20777854/40274879-abc471e2-5bff-11e8-9110-359ac59a538f.png)

What it does is: whatever the key passed it adds up the ascii value of each of the character and then gets the remainder by dividing with the has table size. 
So lets say hash table size is 5. And we know that dividing any integer by 5 the remainder can only be among [0,1,2,3 or 4] which are the valid indexes for the hashTable variable.
Each element in the hashTable is linked list because more than one word can return the same hash value. Thus while searching we first calculate the hash of word being searched , we go to that index and traverse the linked list to find the key. Effectively making the comparisions 1/SIZE.

So lets say we are making a dictionary application where we need to put 1 crore words and their deifnition. After its built without HashMap, if we search a word starting with "Z" it will have to do approx 1 crore comparision. While if we store it in a hash map of size 100 . So first it will look for the hash of the word being searched and then it will look only in that index of the hashTable which is returned by applying the hash on the word being searched. Thus with a hashTable of size 100 we only have to perform 1/100 of the original comparison. (assuming words gets dispersed equally likely in each of the indexes of the hashTable)

In the KVPairImpl.java I have implemented a dictionary were words are stored with unique key. And the "displayHasTableKV()" method is called after storing them all.
![p5](https://user-images.githubusercontent.com/20777854/40274882-b43236e8-5bff-11e8-83a8-900a436e2772.png)

Here's what storing looked like:

And here's what the resulting has table looked like:
