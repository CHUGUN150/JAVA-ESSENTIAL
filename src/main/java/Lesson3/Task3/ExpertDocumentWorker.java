package Lesson3.Task3;

class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    void openDocument() {
        super.openDocument();
    }

    @Override
    void editDocument() {
        super.editDocument();
    }

    @Override
    void saveDocument() {
        System.out.println("Document saved in the new format");
    }
}
