package com.tree.binarytree;

public class BinaryTree {
	// node class to represent single node
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTrees {
		static int idx = 0;

		// in first 1 from 0
		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {

				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			return newNode;
		}

	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + " ");
		inorder(root.left);
		inorder(root);
		inorder(root.right);

	}

	static void main(String[] args) throws Exception {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 1, 6, -1, -1 };

		BinaryTrees tree = new BinaryTrees();
		Node root = tree.buildTree(nodes);
		System.out.println(root.data);
		// preorder(root);
		// inorder(root.data);
	}
}
