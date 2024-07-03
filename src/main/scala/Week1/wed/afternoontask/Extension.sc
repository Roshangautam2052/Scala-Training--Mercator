/*
 1.Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated.
 Certain operators have higher precedence than others.
 !--> negation has higher precedence
 && --> Logical conjunction
 || --> logical disjunction
 We can found it in official scala documentation.

 */
 //2. true|| false && false
// evaluates to true

//3. (true||false)&& false
// evaluates to false

 //4. 1<4 && 7!=10 || 9+10 ==21
// evaluates to true
