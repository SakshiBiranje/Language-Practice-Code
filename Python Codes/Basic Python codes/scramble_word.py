import random

def scramble_word(word):
    scrambled = ''.join(random.sample(word, len(word)))
    return scrambled

def word_scramble_game():
    words = ["python", "simple", "unique", "creative", "programming"]
    word_to_guess = random.choice(words)
    scrambled_word = scramble_word(word_to_guess)
    
    
    print("Welcome to the Word Scramble Game!")
    print(f"Can you guess this word? {scrambled_word}")
    
    attempts = 0
    guessed = False
    
    while not guessed:
        player_guess = input("Your guess: ")
        attempts += 1
        
        if player_guess == word_to_guess:
            guessed = True
            print(f"Congratulations! You guessed the word '{word_to_guess}' in {attempts} attempts.")
        else:
            print("Incorrect guess. Try again!")
    
    
if __name__ == "__main__":
    word_scramble_game()
