#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'contacts' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts 2D_STRING_ARRAY queries as parameter.
#

#Start of my code
#This implementation has features beyond requested in challenge
class TrieNode():
  def __init__(self):
    self.children = {}
    self.count = 0
    self.endOfWord = False

class Trie:
  def __init__(self):
    self.root = TrieNode()
  
  def insert(self, word: str) -> None:
    cur = self.root

    for l in word:
      if l not in cur.children:
        cur.children[l] = TrieNode()
      cur = cur.children[l]
      cur.count+=1
    cur.endOfWord = True

  def search(self, word: str) -> bool:
    cur = self.root
    for l in word:
      if l not in cur.children:
        return False
      cur = cur.children
    return cur.endOfWord
  
  def searchPrefix(self, word: str) -> int:
    cur = self.root
    for l in word:
      if l not in cur.children:
        return 0
      cur = cur.children[l]
    return cur.count

def contacts(queries):
    # Write your code here
    contactTrie = Trie()
    results = []
    
    for q in queries:
        if q[0] == "add":
            contactTrie.insert(q[1])
        else:
            results.append(contactTrie.searchPrefix(q[1]))
            
    return results
            
#End of my code
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    queries_rows = int(input().strip())

    queries = []

    for _ in range(queries_rows):
        queries.append(input().rstrip().split())

    result = contacts(queries)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
