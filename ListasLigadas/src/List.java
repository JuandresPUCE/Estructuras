public class List {
    private Node firstNode;
    private Node lastNode;

    public List () {
        this.firstNode=null;
        this.lastNode=null;
    }
    
    public void unshift(int info){
        Node newNode =new Node(info);
        if (firstNode==null){
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            newNode.setLink(this.firstNode);
            this.firstNode=newNode;
        }
    }

    public void push(int info){
        Node newNode =new Node(info);
        if (firstNode==null){ //this.isEmpty() puede reemplazar el comparativo del condicional
            this.firstNode = newNode;
            this.lastNode = newNode;
        } else {
            this.lastNode.setLink(newNode);
            this.lastNode=newNode;
            // no mandatorio
            this.lastNode.setLink(null);

        }

    }

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public boolean search(int info){
        Node p= firstNode;
        while(p.getLink()!= null){
            //lee la estructura que sea diferente de vacío
            if(p.getInfo()==info){
                //compara la información
                return true;
            }
            p = p.getLink();
        }

        return false;

    }

    public boolean shift(){
        if (this.isEmpty()){
            return false;
        }

        if (this.firstNode.getLink()==null){
            this.firstNode =null;
            this.lastNode =null;
            return true;
        }
        Node temp = this.firstNode;
        this.firstNode=this.firstNode.getLink();
        temp=null;

        return true;

    } 

    public boolean pop(){
        if (this.isEmpty()){
            return false;
        }

        if (this.firstNode.getLink()==null){
            this.firstNode =null;
            this.lastNode =null;
            return true;
        }
        Node temp1 = this.firstNode;
        Node temp2 = this.firstNode;

        while(temp1.getLink()!=null){
            temp2=temp1;
            temp1=temp1.getLink();

        }
        this.lastNode=temp2;
        this.lastNode.setLink(null);
        temp1=null;
        return true;

    }

    public String print(){
        String str ="";
        Node p=this.firstNode;
        while (p.getLink() !=null){
            str += p.getInfo() + "|";
            p = p.getLink();
        }

        return str;

    }


}


