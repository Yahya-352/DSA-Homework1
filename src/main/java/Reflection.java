public class Reflection {

}
// my reflection

// Challenges:
// Recursion was the hardest part and took a lot of time to understand.
// My first attempt popped each element and pushed it back after the recursive
// call. I thought the push would never run because the method calls itself
// first, but I learned that each call pauses and continues once the inner call
// returns. The pushes did run, but they put the elements back in the same
// order, so nothing was reversed. The fix was a second recursive method that
// inserts each element at the bottom of the stack instead of the top.
// I also learned where the data is kept: each recursive call has its own "top"
// variable stored on the call stack, so the call stack acts like the extra
// stack I wasn't allowed to use.


// Efficiency:
// Using 2 stacks is a faster approach which runs in O(n) time, but it needs
// extra memory for the second stack, and the exercise doesn't allow additional
// data structures(my first solution was better i think).

// My recursive solution runs in O(n^2) time. Each time we insert an element at
// the bottom, we have to pop everything above it and push it back\.

// It is not the fastest solution, but with only push and pop allowed and no
// extra data structures, recursion is the only approach i knew.

//Usages in Programming..
//Stacks are useful anytime we want Last thing in to be first thing out(LIFO)
//examples:
// 1) the call stack(what I did in exercise 3)..it saves last element and is first
// thing to be inserted
// 2) browser back butto
// 3) undo button or redo