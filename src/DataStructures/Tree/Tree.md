**Tree - Data Structure**

### **Overview:**
- Trees use **LinkedList** as their underlying data structure.
- **Real-time applications**:
  - Directing locations in **Operating Systems**.
  - **File Systems** in OS.
  - **Databases**.
  - **Routing networks**.
  - Solving **mathematical problems**.
  - **Machine Learning algorithms**.
  - **Image compression**.

### **Advantages & Limitations:**
- **Advantages:**
  - Efficient operations with **O(log n)** time complexity.
- **Limitations:**
  - In an **unbalanced tree**, operations can take **O(n)** time.
- **Solution:**
  - Use **Binary Trees** and apply **Self-balancing techniques** (e.g., AVL Tree, Red-Black Tree).

---
### **Tree Terminology:**
- **Size**: Total number of nodes.
- **Parent & Child**: Relationship between nodes.
- **Siblings**: Nodes having the same parent.
- **Edge**: Connection between two nodes.
- **Height**: Longest path from root to a leaf.
- **Leaf**: Node without children.
- **Level**: Depth of a node from the root.
- **Ancestors & Descendants**: Nodes related through parent-child paths.
- **Degree**: Number of children a node has.

---
### **Types of Binary Trees:**
1. **Complete Binary Tree**: All levels are completely filled.
2. **Full (Strict) Binary Tree**: Every node has **either 0 or 2 children**.
3. **Perfect Binary Tree**: All levels are full, including the last.
4. **Height Balanced Tree**: Maintains balance to optimize operations.
5. **Skewed Binary Tree**: Every node has only **one child**.
6. **Ordered Binary Tree**: Each node follows a specific ordering property.

---
### **Key Properties:**
1. **Perfect Binary Tree:**
   - **Height (h)** → Total nodes = **2^(h+1) - 1**
2. **Total Leaf Nodes:**
   - **2^h**
3. **Levels in a Tree:**
   - **Log(N) + 1**, where **N = no. of leaves**
4. **Strict Binary Tree:**
   - If **N = leaf nodes**, then **N - 1 = internal nodes**
   - **Leaf nodes = Internal nodes + 1**
5. **Leaf Nodes Calculation:**
   - **Leaf nodes = 1 + Internal nodes with 2 children**

---
### **Tree Implementation:**
1. **Linked Representation**
2. **Sequential Representation (Using Arrays)**

