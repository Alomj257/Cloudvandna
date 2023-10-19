function reverseWords(sentence) {
  // Split the sentence into words
  const words = sentence.split(' ');

  // Reverse each word and create a new array
  const reversedWords = words.map(function(word) {
    return word.split('').reverse().join('');
  });

  // Join the reversed words to form the reversed sentence
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);
