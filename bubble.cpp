#include <iostream>

using namespace std;

void bubbleSort(int myArray[], int size) {
    int temp = 0;
    for (int i = 0; i < size; i++) {
        for (int j = 1; j < (size - i); j++) {
            if (myArray[j - 1] > myArray[j]) {
                temp = myArray[j - 1];
                myArray[j - 1] = myArray[j];
                myArray[j] = temp;
            }
        }
    }
}

int main() {
    int myArray[10];
    for (int i = 0; i < 10; i++) {
        cout << "Enter number for " << i << " index: ";
        cin >> myArray[i];
    }

    cout << "Your array: ";
    for (int i = 0; i < 10; i++) {
        cout << myArray[i] << " ";
    }
    cout << endl;

    bubbleSort(myArray, 10);

    cout << "Sorted array: ";
    for (int i = 0; i < 10; i++) {
        cout << myArray[i] << " ";
    }
    cout << endl;

    return 0;
}
