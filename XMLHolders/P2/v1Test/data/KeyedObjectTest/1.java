@Test
    public void testCloning() throws CloneNotSupportedException {
        KeyedObject ko1 = new KeyedObject("Test", "Object");
        KeyedObject ko2 = (KeyedObject) ko1.clone();
        assertTrue(ko1 != ko2);
        assertTrue(ko1.getClass() == ko2.getClass());
        assertTrue(ko1.equals(ko2));
    }

    