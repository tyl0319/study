#include<vector>
using namespace std;

struct treeNode{
 int value;
 treeNode* left;
 treeNode* right;
};
treeNode* root = NULL;

//´´½¨¶þ²æÊ÷
void createTree()
{
  vector<int> treeVal;
  int array[]={100,4,2,3,15,35,6,45,55,20,1,14,56,57,58};
  int k=sizeof(array)/sizeof(array[0]);
   for(int i = 0; i < k; i++)
   {
	    treeNode* newNode = new treeNode;
		treeNode* preNode=NULL;
		newNode->value = array[i];
		newNode->left = NULL;
		newNode->right = NULL;
		if(root == NULL) 
		{
			root = newNode;
			preNode = newNode;

		}
		else
		{
			treeNode* current =root;
			treeNode* back;
			
			while(current != NULL)
			{
				back = current;
				if(current->value > array[i])
					current = current->left;
				else if(current->value < array[i])
					current = current->right;

			}
			
			if(back->value > array[i])
			{
				preNode->left = newNode;

			}
			else if(back->value > array[i])
			{
				preNode->right = newNode;
			}
		}
   }

}

int main()
{
	return 0;
}