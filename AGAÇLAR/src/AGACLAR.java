
class dugum{
int content;
dugum rigth,left;
dugum (int content){
this.content=content;
rigth=null;
left=null;
}
}
public class AGACLAR {
    
dugum root;
public AGACLAR(){
root=null;
}
 void add(dugum yeni){
if(root==null){
root=yeni;
}
else{
dugum tmp=root;
dugum once=null;
while(tmp!=null){
once=tmp;
//if(yeni.icerik<tmp.icerik){
//tmp=tmp.sol;
//}
//tmp=tmp.sag;
//}
if(yeni.content<tmp.content){
once.left=yeni;

}
else{once.rigth=yeni;}

}
}
 }
 
 public dugum sourch(int sourch){
 dugum tmp=root;
 while(tmp!=null){
 if(sourch==tmp.content){
 return tmp;
 }
 else if(sourch<tmp.content){
 tmp=tmp.left;
 }
 else{
 tmp=tmp.rigth;
 }
 }
    return null;
 }
 
 
 public dugum smallest(){
  dugum tmp=root;
  while(tmp.left!=null){
  tmp=tmp.left;}
    return tmp;
  }
 
public dugum biggest(){
  dugum tmp=root;
  while(tmp.rigth!=null){
  tmp=tmp.rigth;}
    return tmp;
  }
 
 void show(){ // I NOT SURE
 dugum tmp=root,tmp1=root;
 while(tmp!=null){
 tmp=tmp.left;
     System.out.println(tmp.content);
 }
 while(tmp1!=null){
 tmp1=tmp1.rigth;
     System.out.println(tmp1.content);
 }
 }
    
}
