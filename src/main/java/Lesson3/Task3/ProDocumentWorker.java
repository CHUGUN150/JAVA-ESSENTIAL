package Lesson3.Task3;

class ProDocumentWorker extends DocumentWorker {

    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    void saveDocument() {
        System.out.println("Document is saved in the old format, saving in the new format is available in the expert version");
    }
}
