package com.loan.loanapp.service;

import java.util.Collection;


import com.loan.loanapp.entity.Document;


public interface DocumentService {
	Document getDocumentById(Integer id);
	Collection<Document> getAllDocument();
	
}
