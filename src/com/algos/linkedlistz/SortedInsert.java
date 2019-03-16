package com.algos.linkedlistz;

/**
 *
 * https://www.geeksforgeeks.org/insert-value-sorted-way-sorted-doubly-linked-list/
 * sortedInsert(head_ref, newNode)
 *       if (head_ref == NULL)
 *       head_ref = newNode
 *
 *       else if head_ref->data >= newNode->data
 *           newNode->next = head_ref
 *       newNode->next->prev = newNode
 *       head_ref = newNode
 *
 *       else
 *       Initialize current = head_ref
 *       while (current->next != NULL and
 *                current->next->data data)
 *         current = current->next
 *
 *       newNode->next = current->next
 *       if current->next != NULL
 *         newNode->next->prev = newNode
 *
 *           current->next = newNode
 *       newNode->prev = current
 */
public class SortedInsert {
}
