from codes import alphabet

choice = 0
while choice == 0:

    direction = input("Type 'encode' to encrypt, type 'decode' to decrypt:\n")
    text = input("Type your message:\n").lower()
    shift = int(input("Type the shift number:\n"))

    def encrypt(text_letter , shift_number):
        cypher_text = ""
        for i in text_letter:
            old_position = alphabet.index(i)
            new_position = old_position + shift_number
            new_letter = alphabet[new_position]
            cypher_text += new_letter

        print(cypher_text)

    def decrypt(text_letter , shift_number):
        cypher_text = ""
        for i in text_letter:
            new_position = alphabet.index(i)
            old_position = new_position - shift_number
            old_letter = alphabet[old_position]
            cypher_text += old_letter

        print(cypher_text)

    if direction == "encode":
        encrypt(text_letter=text , shift_number=shift)

    else:
        decrypt(text_letter=text, shift_number=shift)

    choice = input("enter choice")
