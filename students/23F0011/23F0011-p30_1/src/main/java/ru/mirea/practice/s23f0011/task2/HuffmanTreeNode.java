package ru.mirea.practice.s23f0011.task2;

class HuffmanTreeNode {
    int freq;
    char character;
    HuffmanTreeNode left;
    HuffmanTreeNode right;

    HuffmanTreeNode(char character, int freq) {
        this.character = character;
        this.freq = freq;
        left = right = null;
    }
}