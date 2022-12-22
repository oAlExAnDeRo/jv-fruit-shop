package core.basesyntax.services.strategy;

import core.basesyntax.model.FruitTransaction;

public interface OperationHandler {
    void operation(FruitTransaction fruitTransaction);
}