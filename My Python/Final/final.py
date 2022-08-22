# name_list = []
# mystring = ''
# while (True) :
#     name = input("Next Word : ")
#     name_list.append(name)    
#     if name == "." :
#         break
# for x in name_list:
#     mystring += ' ' + x
# print ("Sentence : ", mystring)

# def calcNodes(N, I):
#     result = 0
 
#     result = I * (N - 1) + 1
 
#     return result
 
# # Driver Code
# if __name__ == '__main__':
#     N = 5
#     I = 10
 
#     print("Leaf nodes = ",
#            calcNodes(N, I))
    
    
# from unittest import result


# def calcNodes(N, I):
#     I = 0
 
#     # result = I * (N - 1) + 1
#     I = result / (N - 1) - 1
 
#     return I
 
# # Driver Code
# if __name__ == '__main__':
#     N = 6
#     result = 220
#     print("Leaf nodes = ",
#            calcNodes(N, result))

# A class to store a binary tree node
class Node:
    def __init__(self, key=None, left=None, right=None):
        self.key = key
        self.left = left
        self.right = right
 
 
# Recursive function to calculate the height of a given binary tree
def height(root):
 
    # base case: empty tree has a height of 0
    if root is None:
        return 0
 
    # recur for the left and right subtree and consider maximum depth
    return 1 + max(height(root.left), height(root.right))
 
 
if __name__ == '__main__':
 
    root = Node(15)
    root.left = Node(10)
    root.right = Node(20)
    root.left.left = Node(8)
    root.left.right = Node(12)
    root.right.left = Node(16)
    root.right.right = Node(25)
 
    print('The height of the binary tree is', height(root))