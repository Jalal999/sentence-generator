# sentence-generator
This assignment required to use the Strategy and the Observer patterns.

Sentence Generator is a program that generates sentences using English words. All sentence
generators have an internal vocabulary, which is initially empty and can be updated by adding
some words. All sentence generators are able to generate sentences according to some rules.
You have to implement following three types of sentence generators:

<h3>Random Sentence Generator - RSG</h3>
When a word is added to RSG, before storing it in internal vocabulary, the word is
converted to lower case. RSG generates new sentences by randomly picking random
amount of words from its internal vocabulary and concatenating them using single
space between the words.

<h3>Sorted Sentence Generator - SSG</h3>
Before adding a word into its internal vocabulary, SSG also converts the word to lower
case. Like RSG, SSG picks up the words randomly. The only difference is that it sorts
these words before the concatenation.

<h3>Ordered Sentence Generator - OSG</h3>
OSG is different from both RSG and SSG. A word, before adding into internal
vocabulary, will be converted to upper case and reversed. OSG concatenates all of the
words in the same order they have been added to the vocabulary. 
