/*
 1.Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated.
 Certain operators have higher precedence than others.
 !--> negation has highest precedence
 && --> Logical conjunction has second highest precedence
 || --> logical disjunction has least precedence among other operators
 We can found it in official scala documentation.

 */
 //2. true|| false && false
// evaluates to true

//3. (true||false)&& false
// evaluates to false

 //4. 1<4 && 7!=10 || 9+10 ==21
// evaluates to true
