@Test
    public void testCloning() throws CloneNotSupportedException {
        LabelBlock b1 = new LabelBlock("ABC", new Font("Dialog",
                Font.PLAIN, 12), Color.RED);
        LabelBlock b2 = (LabelBlock) b1.clone();
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));
    }

    