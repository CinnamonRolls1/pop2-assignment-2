// Implementation of Linear search in C

#include<stdio.h>

int search(int *arr,int key,int n){
	int test = -1;
	for(int i=0;i<n;i++){
		if(arr[i] == key)
			test = i;
	}
	return test;
}

int main(){
	int n;
	printf("Please enter the number of elements: ");
	scanf("%d",&n);
	int *arr = (int *)malloc(n*sizeof(int));
	printf("Please enter the elements: ");
	for(int i=0;i<n;i++){
		scanf("%d",arr+i);
	}
	int key;
	printf("Enter the element to be searched(key): ");
	scanf("%d",&key);
	int test = search(arr,key,n);
	if(test != -1)
		printf("Key found at index: %d",test);
	else
		printf("Key not found!");
	return 0;
}