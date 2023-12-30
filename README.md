# Binary-Tree-Path-Sum
Given a binary tree and a number ‘S’, find if the tree has a path from root-to-leaf such that the sum of all the node values of that path equals ‘S’.

                                                                      12

                                                              7                  1

                                                        9              10                 5
                                                  
                                                  Sum: 23
                                                  output: True

Time Complexity:
The time complexity is O(n), where n is the number of nodes in the binary tree. In the worst case, we might need to visit all nodes to determine if there is a path with the given sum.

Space Complexity:
The space complexity is O(h), where h is the height of the binary tree. In the worst case, the stack could have all nodes from the root to the deepest leaf. This happens when the tree is skewed, and the height of the tree becomes h.
In summary, the provided iterative solution has a time complexity of O(n) and a space complexity of O(h).
