#include <iostream>

int a = 5;

int fun() {
    a = 17;
    return 3;
}

int main() {
    int b = a + fun();
    std::cout << "Result: " << b << std::endl;
    return 0;
}