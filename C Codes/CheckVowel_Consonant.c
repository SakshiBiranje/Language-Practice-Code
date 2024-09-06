#include<stdio.h>

//to check character is vowel or not
int main()
{
    int c;
    printf("Enter a character : ");
    scanf("%c",&c);
    
    if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'||c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
    {
        printf("vowel");
    }
    else{
        printf("consonant");
    }
}