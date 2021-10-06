@Test
    public void testSizing() {
        BlockContainer container = new BlockContainer(new BorderArrangement());
        BufferedImage image = new BufferedImage(200, 100,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();

        // TBLRC
        // 00000 - no items
        Size2D size = container.arrange(g2);
        assertEquals(0.0, size.width, EPSILON);
        assertEquals(0.0, size.height, EPSILON);

        // TBLRC
        // 00001 - center item only
        container.add(new EmptyBlock(123.4, 567.8));
        size = container.arrange(g2);
        assertEquals(123.4, size.width, EPSILON);
        assertEquals(567.8, size.height, EPSILON);

        // TBLRC
        // 00010 - right item only
        container.clear();
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 00011 - right and center items
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(22.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // try case where right item is shorter than center item
        container.clear();
        Block rb = new EmptyBlock(12.3, 15.6);
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(rb, RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(22.3, size.width, EPSILON);
        assertEquals(20.0, size.height, EPSILON);
        assertEquals(20.0, rb.getBounds().getHeight(), EPSILON);

        // TBLRC
        // 00100 - left item only
        container.clear();
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 00101 - left and center items
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(22.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // try case where left item is shorter than center item
        container.clear();
        Block lb = new EmptyBlock(12.3, 15.6);
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(lb, RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(22.3, size.width, EPSILON);
        assertEquals(20.0, size.height, EPSILON);
        assertEquals(20.0, lb.getBounds().getHeight(), EPSILON);

        // TBLRC
        // 00110 - left and right items
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(22.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 00111 - left, right and center items
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        container.add(new EmptyBlock(5.4, 3.2), RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(27.7, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 01000 - bottom item only
        container.clear();
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 01001 - bottom and center only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01010 - bottom and right only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01011 - bottom, right and center
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3));
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(31.0, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01100
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01101 - bottom, left and center
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3));
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(31.0, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01110 - bottom. left and right
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(31.0, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 01111
        container.clear();
        container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(9.0, 10.0));
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(14.0, size.height, EPSILON);

        // TBLRC
        // 10000 - top item only
        container.clear();
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(45.6, size.height, EPSILON);

        // TBLRC
        // 10001 - top and center only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0));
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10010 - right and top only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10011 - top, right and center
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3));
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(33.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10100 - top and left only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10101 - top, left and center
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3));
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(33.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10110 - top, left and right
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT);
        size = container.arrange(g2);
        assertEquals(33.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 10111
        container.clear();
        container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(9.0, 10.0));
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(12.0, size.height, EPSILON);

        // TBLRC
        // 11000 - top and bottom only
        container.clear();
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(12.3, size.width, EPSILON);
        assertEquals(65.6, size.height, EPSILON);

        // TBLRC
        // 11001
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3));
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(77.9, size.height, EPSILON);

        // TBLRC
        // 11010 - top, bottom and right
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(77.9, size.height, EPSILON);

        // TBLRC
        // 11011
        container.clear();
        container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(9.0, 10.0));
        size = container.arrange(g2);
        assertEquals(16.0, size.width, EPSILON);
        assertEquals(16.0, size.height, EPSILON);

        // TBLRC
        // 11100
        container.clear();
        container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.LEFT);
        container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM);
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(77.9, size.height, EPSILON);

        // TBLRC
        // 11101
        container.clear();
        container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(9.0, 10.0));
        size = container.arrange(g2);
        assertEquals(14.0, size.width, EPSILON);
        assertEquals(16.0, size.height, EPSILON);

        // TBLRC
        // 11110
        container.clear();
        container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT);
        size = container.arrange(g2);
        assertEquals(12.0, size.width, EPSILON);
        assertEquals(14.0, size.height, EPSILON);

        // TBLRC
        // 11111 - all
        container.clear();
        container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP);
        container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM);
        container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT);
        container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT);
        container.add(new EmptyBlock(9.0, 10.0));
        size = container.arrange(g2);
        assertEquals(21.0, size.width, EPSILON);
        assertEquals(16.0, size.height, EPSILON);

    }

    