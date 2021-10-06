@Test
    public void testCloning() throws CloneNotSupportedException {
        KeyedObjects ko1 = new KeyedObjects();
        ko1.addObject("V1", 1);
        ko1.addObject("V2", null);
        ko1.addObject("V3", 3);
        KeyedObjects ko2 = (KeyedObjects) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));
    }

    