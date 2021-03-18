package midterm2020_2021;

class MessageGarbler {

    // The number of blocks used in this MessageGarbler
    public int m;

    /**
     * Creates a MessageGarbler that splits any messages it receives into blocks of size m, the last block will contain the remainder
     *
     * @param m
     */
    public MessageGarbler(int m) {
        this.m = m;
    }

    /**
     * Encrypts a message by splitting the message into blocks of size m and reversing each block.
     *
     * @param message
     *     the message to be encrypted
     * @return
     */
    public char[] encrypt(char[] message) {
        if (message == null || message.length == 0 || this.m <= 1) return message;

        int len = message.length;

        for (int i = 0; i < message.length; i += m) { // to loop through array
            int blockEnd = i + m;
            int l = i;
            if (blockEnd < message.length) {
                for (int j = 0; j < m /2; j++) { // to reverse blocks
                    char temp = message[l];
                    message[l] = message[blockEnd-j-1];
                    message[blockEnd-j-1] = temp;
                    l++;
                }
            } else {
                for (int k = 0; k < (message.length - i) /2; k++) { // to reverse blocks
                    char temp = message[l];
                    message[l] = message[len-k-1];
                    message[len-k-1] = temp;
                    l++;
                }
            }
            
        }
        return message;
    }

}


