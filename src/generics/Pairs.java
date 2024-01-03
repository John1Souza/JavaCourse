package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pairs<K extends Number, V> {

    private final Set<Pair<K, V>> items = new LinkedHashSet<>();
    // Set não aceita repetição, o critério definido pelo equals e hashcode foi a chave
    //, todas as chaves duplicadas seriam ignoradas
    // LinkedHashSet -> garante ordenação pela ordem de inclusão
    public void toAdd(K key, V value){
        if(key == null) return;

        Pair<K, V> newPair = new Pair<>(key, value);
        if(items.contains(newPair)){
            items.remove(newPair);
        }
        items.add(new Pair<>(key, value));
    }

    public V getValue(K key){
        if(key == null) return null;
        Optional<Pair<K, V>> optionalPair =  items.stream()
                .filter(pair -> key.equals(pair.getKey()))
                .findFirst();
        // return optionalPair.isPresent() ? optionalPair.get().getValue() : null;
        return optionalPair.map(Pair::getValue).orElse(null);
    }

}
