package main.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BFSPeerSearch {

    public static List<String> shortestPaths = new ArrayList<String>();

    public static void main(String args[]){
        //list created for storing level wise Nodes
        List<String> l0 = new ArrayList<String>();
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = new ArrayList<String>();
        List<String> l4 = new ArrayList<String>();

        BFSPeerSearch bfs = new BFSPeerSearch();

        // storing values to a Ternary tree node.
        //level 0 - root node
        UnBalancedTree myTree = new UnBalancedTree("A");

        //level 1
        myTree.left = new UnBalancedTree("B");
        myTree.middle = new UnBalancedTree("H");
        myTree.right = new UnBalancedTree("L");
        //level 2
        myTree.left.left = new UnBalancedTree("C");
        myTree.left.right = new UnBalancedTree("F");

        myTree.middle.left = new UnBalancedTree("I");
        myTree.middle.right = new UnBalancedTree("J");

        myTree.right.left = new UnBalancedTree("M");

        // level3
        myTree.left.left.left = new UnBalancedTree("D");

        myTree.left.right.right = new UnBalancedTree("G");

        myTree.middle.right.left = new UnBalancedTree("K");

        myTree.right.left.left = new UnBalancedTree("N");

        // level 4
        myTree.left.left.left.left = new UnBalancedTree("E");

        myTree.right.left.left.left = new UnBalancedTree("O");

        shortestPaths.clear();
        bfs.printTreeLevel(myTree, 0, 0);
        l0.addAll(shortestPaths);

        shortestPaths.clear();
        bfs.printTreeLevel(myTree, 0, 1);
        l1.addAll(shortestPaths);

        shortestPaths.clear();
        bfs.printTreeLevel(myTree, 0, 2);
        l2.addAll(shortestPaths);

        shortestPaths.clear();
        bfs.printTreeLevel(myTree, 0, 3);
        l3.addAll(shortestPaths);

        shortestPaths.clear();
        bfs.printTreeLevel(myTree, 0, 4);
        l4.addAll(shortestPaths);

        // getting input from user to find the node for which peer node is to be found
        Scanner scan = new Scanner(System.in);
        char ch = 'y';
        do{
            System.out.println("Enter the node for which peer node has to be found : ");
            String s = scan.next();
            System.out.println("Sibling result : " + bfs.peer(s,l0,l1,l2,l3,l4));

            System.out.println("\nDo you want to continue (Type y or Y) \n");
            ch = scan.next().charAt(0);
        }while (ch == 'Y'|| ch == 'y');

        System.out.println("Thanks for using Trinary tree search");
        scan.close();
    }

    // checking if the node exist in the tree and if it exists checking to find its next right node
    // The node values are case sensitive
    private  String peer(String word, List<String> l0, List<String> l1, List<String> l2, List<String> l3, List<String> l4) {

        if(l0.contains(word)){

            System.out.println("It is the Root node");
            String a = "The node is Root Node";
            return a;
        }
        else if(l1.contains(word)){
            int index = l1.indexOf(word);
            if(index < l1.size()-1)
            {
                return l1.get(index+1);
            }
            else{
                return "This is the last Child Node and has No Right peer node";
            }
        }
        else if(l2.contains(word)){
            int index = l2.indexOf(word);
            if(index < l2.size()-1)
            {
                return l2.get(index+1);
            }
            else{
                return "This is the last Child Node and has No Right peer node";
            }

        }
        else if(l3.contains(word)){
            int index = l3.indexOf(word);
            if(index < l3.size()-1)
            {
                return l3.get(index+1);
            }
            else{
                return "This is the last Child Node and has No Right peer node";
            }
        }
        else if(l4.contains(word)){
            int index = l4.indexOf(word);
            if(index < l4.size()-1)
            {
                return l4.get(index+1);
            }
            else{
                return "This is the last Child Node and has No Right peer node";
            }
        }
        else{
            System.out.println("The node doesn't exist int the tree");
        }
        return "No node found";
    }

    // breadth first search is being applied for searching and finding all the peer nodes in a particular node levels.
    public void printTreeLevel(UnBalancedTree t,int currentLevel,int desire){

        //List<String> level1 = new ArrayList<String>();
        // firstly check if currentLevel > desire or the current tree is empty, then return without going further
        if(t==null || currentLevel>desire){
            return;
        }
        // now check if current==desire
        if(currentLevel == desire){
            shortestPaths.add(t.root);
        }else{
            // proceed to left , middle and right trees of a particular level node
            printTreeLevel(t.left , currentLevel+1 , desire);// update the current level
            printTreeLevel(t.middle , currentLevel+1 , desire);
            printTreeLevel(t.right , currentLevel+1 , desire);
        }

        //	return level1;
    }
}

// Tree is created with TrinaryNodes. with Root and left,middle,right as branches
 class UnBalancedTree{

    public String root;
    public UnBalancedTree left;
    public UnBalancedTree right;
    public UnBalancedTree middle;

    public UnBalancedTree(String value){
        root = value;
        left = right = middle = null;
    }
}


