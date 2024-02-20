# Stacks

- **Veloso's Traversable Stack (VTS)** - Is a stack that, in addition to normal operations, has the ability to non-destructively read from the position indicated by the cursor (**peek**).
    The cursor can be placed at the top of the stack (**top**) and moved one position down the stack (**down**). Normal operations (**push, pop**) automatically place the cursor at the top.
    The **reverse()** operation reverses the stack order using an additional stack.
  
-  **TwoStacksQueue** - An implementation of an efficient queue using two stacks - the internal queue representation uses two stacks.

- **SinkingStack** - A stack with limited capacity. When inserting an item into the full stack, removes the item at the bottom of the stack (**sink**) to make room at the top for the new item.
  Efficient implementation of a queue at a lecture in O(1) time.

- **JosephusProblem** - solution as a queue of numbers (people's positions). Problem: n people are arranged in a circle. We start counting from the first person (counting only the survivors)
  and each kth person must commit suicide. The question is, given n and k, which position should you place in order to be the last one chosen (i.e. survive). For example, we have n = 6 people
  and we remove every other person (k = 2). If we number people from 1 to 6, people with numbers 2, 4, 6 will be eliminated one by one (so 1, 3, 5 will remain in the circle), then 3, 1 will
  commit suicide and person number 5 will remain alive.
