


import java.io.IOException;
import java.util.Scanner;

public class Kursova {

public static void main(String[] args) throws IOException {
        Schiffer Message = new Schiffer();
        Scanner input = new Scanner(System.in);
        System.out.println("������ ����������� �����, ����� ������� �� ����������.");
        System.out.println("1.���������� ");
        System.out.println("2.������������ ");


while(true){
int choice = input.nextInt();
switch(choice){

case 1:
                    Message.crypt();break;
case 2:
                    Message.deCrypt();break;
default:
                    System.out.println("�������, ����� ������ �� �������� �� 1 � 2, ��� ������� �� �������� �������� 56."); break;
            }
        }
    }
}

public class Schiffer {

char[] alphabet = {'�','�','�','�','�','�','�','�','�','�','�','�','�',
'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�',
'�','�',' '};

void crypt() throws IOException{
        ArrayList<Integer> keyLetters = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Input message: ");
        String message = input.nextLine();

        System.out.println("Key: ");
        String key = input.nextLine();

        StringBuilder sb = new StringBuilder(message);
        StringBuilder sbKey = new StringBuilder(key);

for(int i = 0; i<sbKey.length(); i++){
for(int j = 0; j <alphabet.length ;j++){
if (sbKey.charAt(i) == alphabet[j]){
                    keyLetters.add(j+1);
break;
                }

            }
        }
for(int i = 0; i<sb.length();i++){
for(int j = 0; j <alphabet.length;j++){
if(sb.charAt(i) == alphabet[j]){
                    sb.setCharAt(i, alphabet[(j  + keyLetters.get(i%keyLetters.size()))%alphabet.length]);
break;
                }
            }
        }System.out.println(sb);
    }

void deCrypt() throws IOException{
        ArrayList<Integer> keyLetters = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Input message: ");
        String message = input.nextLine();

        System.out.println("Key: ");
        String key = input.nextLine();

        StringBuilder sb = new StringBuilder(message);
        StringBuilder sbKey = new StringBuilder(key);

for(int i = 0; i<sbKey.length(); i++){
for(int j = 0; j <alphabet.length ;j++){
if (sbKey.charAt(i) == alphabet[j]){
                    keyLetters.add(j+1);
break;
                }

            }


        } for (Integer integer : keyLetters) {
            System.out.println(integer);
        }



for(int i = 0; i<sb.length();i++){
for(int j = 0; j <alphabet.length;j++){
if(sb.charAt(i) == alphabet[j]){
int sizeOfArray = alphabet.length;
                    sb.setCharAt(i, alphabet[(sizeOfArray + (j  - keyLetters.get(i%keyLetters.size())))%alphabet.length]);
break;
                }

            }

        } System.out.println(sb);
    }
}


