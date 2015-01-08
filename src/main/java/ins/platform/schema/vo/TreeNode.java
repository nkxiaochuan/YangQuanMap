package ins.platform.schema.vo;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
	private T value;
	private TreeNode<T> parent;
	private List<TreeNode<T>> children;

	public TreeNode(T value) {
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public TreeNode<T> getParent() {
		return this.parent;
	}

	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}

	public void addChild(TreeNode<T> node) {
		if (this.children == null) {
			this.children = new ArrayList();
		}
		this.children.add(node);
	}

	public List<TreeNode<T>> getChildren() {
		return this.children;
	}

	public List<TreeNode<T>> getAllChildren() {
		if (isLeaf()) {
			return null;
		}
		List list = new ArrayList();
		list.addAll(this.children);
		for (TreeNode node : this.children) {
			if (!(node.isLeaf())) {
				list.addAll(node.getAllChildren());
			}
		}
		return list;
	}

	public List<TreeNode<T>> getAllParent() {
		List list = new ArrayList();
		if ((this.parent != null) && (this.parent != this)) {
			list.add(this.parent);
			list.addAll(this.parent.getAllParent());
		}
		return list;
	}

	public int getTreeWidth() {
		if (isLeaf()) {
			return 1;
		}
		int width = 0;
		for (TreeNode node : this.children) {
			width += node.getTreeWidth();
		}
		return width;
	}

	public int getTreeDepth() {
		if (isLeaf()) {
			return 1;
		}
		int maxDepth = 0;
		for (TreeNode node : this.children) {
			int depth = node.getTreeDepth();
			if (depth > maxDepth) {
				maxDepth = depth;
			}
		}
		maxDepth += 1;
		return maxDepth;
	}

	public boolean isLeaf() {
		return ((this.children == null) || (this.children.size() == 0));
	}
}