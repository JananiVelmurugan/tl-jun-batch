
package com.training.visitor;

public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}
