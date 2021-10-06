@Test
    public void testCloning() throws CloneNotSupportedException {
        StandardDialRange r1 = new StandardDialRange();
        StandardDialRange r2 = (StandardDialRange) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));

        // check that the listener lists are independent
        MyDialLayerChangeListener l1 = new MyDialLayerChangeListener();
        r1.addChangeListener(l1);
        assertTrue(r1.hasListener(l1));
        assertFalse(r2.hasListener(l1));
    }

    