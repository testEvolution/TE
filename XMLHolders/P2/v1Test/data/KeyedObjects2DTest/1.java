@Test
    public void testCloning() throws CloneNotSupportedException {
        KeyedObjects2D o1 = new KeyedObjects2D();
        o1.setObject(1, "V1", "C1");
        o1.setObject(null, "V2", "C1");
        o1.setObject(3, "V3", "C2");
        KeyedObjects2D o2 = (KeyedObjects2D) o1.clone();
        assertTrue(o1 != o2);
        assertTrue(o1.getClass() == o2.getClass());
        assertTrue(o1.equals(o2));

        // check independence
        o1.addObject("XX", "R1", "C1");
        assertFalse(o1.equals(o2));
    }

    