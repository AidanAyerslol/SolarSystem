public class System {

    private class Node {
        private body body;
        private Node next;

        private void fillNode(body addedbody){
            body = addedbody;
            next = new Node();
        }

        public body getBody(){
            return body;
        }
        public Node next(){
            return next;
        }

        public boolean addtoList(Node root, body addedbody){
            if (root.getBody() == null) {
                root.fillNode(addedbody);
                return true;
            }
            else {
                addtoList(root.next(), addedbody);
                return false;
            }

            }
        }

    }
