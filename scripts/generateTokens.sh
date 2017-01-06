FILE_PATH="src/main/resources/t8.shakespeare.txt"

# this is to generate the tokens for the $FILE_PATH
tr -sc "A-Za-z\'A-Za-z" "\n" < $FILE_PATH | sort | uniq -c | sort -r -n