@Test
    public void testCloning2() throws CloneNotSupportedException {
        // case 1 - object is mutable but not PublicCloneable
        Object obj1 = new ArrayList();
        KeyedObject ko1 = new KeyedObject("Test", obj1);
        KeyedObject ko2 = (KeyedObject) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));

        // the clone contains a reference to the original object
        assertTrue(ko2.getObject() == obj1);

        // CASE 2 - object is mutable AND PublicCloneable
        obj1 = new DefaultPieDataset();
        ko1 = new KeyedObject("Test", obj1);
        ko2 = (KeyedObject) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));

        // the clone contains a reference to a CLONE of the original object
        assertTrue(ko2.getObject() != obj1);
    }

    