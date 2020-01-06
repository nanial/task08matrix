package by.training.task08.exception;

import org.apache.log4j.Logger;


public class MatrixException extends Exception{

    private static final long serialVersionUID = 1L;

    private static final Logger logger = Logger.getLogger(MatrixException.class);

    public MatrixException() {
        super();
    }

    public MatrixException(String message) {
       logger.info(message);
    }

    public MatrixException(Exception e) {
        super(e);
    }

    public MatrixException(String message, Exception e) {
        super(message, e);
    }

}
