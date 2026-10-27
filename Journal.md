
## Phase 1
I created the node class and BST insertion method. Smaller or equal
values go left, and larger values go right until an empty spot is found.
Comparable lets the tree compare values using compareTo.

## Phase 2
I added the height method. It returns -1 for an empty subtree and adds
1 to the larger child height. This finds the deepest branch.

## Phase 3
I added inorder and preorder traversals. Inorder prints sorted values
because it visits smaller values on the left, the current value,
and then larger values on the right.

## Phase 4
The expected heights are -1 for an empty tree, 0 for a single node,
2 for the sample tree, and 3 for the sorted four-node tree.
Sorted insertion creates a chain of right children. Its height is
the number of nodes minus 1. The null base cases let traversals
handle an empty tree safely.
