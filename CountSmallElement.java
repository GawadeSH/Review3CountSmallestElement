package com.element;

public class CountSmallElement
{
    public static void main(String[] args) {
        int[] array = {3, 1, 1, 6, 2, 9, 1, 4, 1};
        int temp=0;

        int i,j;
        for (i = 0; i < array.length; i++)
        {
            for (j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
        for (i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+"   ");
        }

        System.out.println("Smallest element is:-"+array[0]);

int count=1;
           for (j = 0; j < array.length-1; j++)
           {
               if (array[j] == array[j+1])
               {
                   count++;
               }
           }
           System.out.println(array[0]+" appear "+count+" time");

        }

    }


