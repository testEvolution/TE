@Test
    public void testCloning2() throws CloneNotSupportedException {
        // case 1 - object is mutable but not PublicCloneable
        Object obj1 = new ArrayList();
        KeyedObjects ko1 = new KeyedObjects();
        ko1.addObject("K1", obj1);
        KeyedObjects ko2 = (KeyedObjects) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));

        // the clone contains a reference to the original object
        assertTrue(ko2.getObject("K1") == obj1);

        // CASE 2 - object is mutable AND PublicCloneable
        obj1 = new DefaultPieDataset();
        ko1 = new KeyedObjects();
        ko1.addObject("K1", obj1);
        ko2 = (KeyedObjects) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));

        // the clone contains a reference to a CLONE of the original object
        assertTrue(ko2.getObject("K1") != obj1);
    }

    