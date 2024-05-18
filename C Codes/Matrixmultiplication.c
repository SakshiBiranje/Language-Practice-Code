#include <stdio.h>

void multiplyMatrices(int firstMatrix[10][10], int secondMatrix[10][10], int result[10][10], int row1, int col1, int col2) {
    for (int i = 0; i < row1; ++i) {
        for (int j = 0; j < col2; ++j) {
            result[i][j] = 0;
            for (int k = 0; k < col1; ++k) {
                result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
            }
        }
    }
}

int main() 
{
    int firstMatrix[10][10], secondMatrix[10][10], result[10][10], row1, col1, row2, col2;

    printf("Enter rows and columns for the first matrix: ");
    scanf("%d %d", &row1, &col1);

    printf("Enter rows and columns for the second matrix: ");
    scanf("%d %d", &row2, &col2);

    if (col1 != row2) {
        printf("Matrix multiplication not possible.\n");
        return 0;
    }

    printf("Enter elements of the first matrix:\n");
    for (int i = 0; i < row1; ++i) {
        for (int j = 0; j < col1; ++j) {
            scanf("%d", &firstMatrix[i][j]);
        }
    }

    printf("Enter elements of the second matrix:\n");
    for (int i = 0; i < row2; ++i) {
        for (int j = 0; j < col2; ++j) {
            scanf("%d", &secondMatrix[i][j]);
        }
    }

    multiplyMatrices(firstMatrix, secondMatrix, result, row1, col1, col2);


    printf("\nResultant Matrix:\n");
    for (int i = 0; i < row1; ++i) {
        for (int j = 0; j < col2; ++j) {
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }

    return 0;
}
